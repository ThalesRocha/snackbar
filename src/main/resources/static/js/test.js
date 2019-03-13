(function() {
    document
      .querySelector("#fazer-pedido")
      .addEventListener("click", realizar_pedido);
    document.querySelector("#montar-pedido").addEventListener("click", load_home);
  
    function get_json_data() {
      var ajax = new XMLHttpRequest();
      ajax.open("GET", "http://localhost:8080/sandwichs_ingredients", true);
      ajax.send();
  
      ajax.onreadystatechange = function() {
        if (ajax.readyState == 4 && ajax.status == 200) {
          var data = JSON.parse(ajax.responseText);
          append_json(data);
        }
      };
    }
  
    function append_json(data) {
      var table = document.querySelector("table");
      data.forEach(function(object) {
        var tr = document.createElement("tr");
        tr.innerHTML =
          '<td><input type="checkbox" name="selectOrder"></td>' +
          '<td style="display:none;">' +
          object.id +
          "</td>" +
          "<td>" +
          object.name +
          "</td>" +
          "<td>" +
          format_ingredients(object.ingredients) +
          "</td>" +
          "<td>" +
          '<input type="number" name="quantity" value=0>' +
          "</td>";
        table.appendChild(tr);
      });
    }
  
    function format_ingredients(data) {
      var text = "";
      data.forEach(element => {
        text += element.name + " R$" + element.price + "<br>";
      });
      return text;
    }
  
    function realizar_pedido() {
      var ajax = new XMLHttpRequest();
      ajax.open("GET", "http://localhost:8080/views/default-order.html", true);
      ajax.send();
  
      ajax.onreadystatechange = function() {
        if (ajax.readyState == 4 && ajax.status == 200) {
          document.querySelector("#default").innerHTML = ajax.response;
          get_json_data();
        }
      };
  
      //var order = buildOrder();
      //
      //var ajax = new XMLHttpRequest();
      //
      //ajax.open("POST", "http://localhost:8080/register/order", true);
      //ajax.setRequestHeader("Content-type", "application/json");
      //
      //ajax.send(JSON.stringify(order));
      //
      //ajax.onreadystatechange = function() {
      //  if (ajax.readyState == 4 && ajax.status == 200) {
      //    var data = ajax.responseText;
      //  }
      //};
    }
  
    function buildOrder() {
      debugger;
      var table = document.querySelector("table");
      var order = { orderType: "DEFAULT", sandwichs: [] };
      for (var i = 1; i < table.rows.length; i++) {
        debugger;
        if (table.rows[i].cells[0].children[0].checked) {
          order.sandwichs.push({
            id: table.rows[i].cells[1].innerHTML,
            name: table.rows[i].cells[2].innerHTML,
            quantity: parseInt(table.rows[i].cells[4].children[0].value)
          });
        }
      }
      return order;
    }
  
    function load_home() {
      document.querySelector("#default").innerHTML =
        '<object type="text/html" data="../views/custom_order.html" ></object>';
    }
  })();
  