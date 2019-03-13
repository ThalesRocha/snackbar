(function() {
  document
    .querySelector("#default-sandwichs")
    .addEventListener("click", get_default_sandwichs);

  function get_default_sandwichs() {
    var ajax = new XMLHttpRequest();
    ajax.open("GET", "http://localhost:8080/sandwichs_ingredients", true);
    ajax.send();

    ajax.onreadystatechange = function() {
      if (ajax.readyState == 4 && ajax.status == 200) {
        var data = JSON.parse(ajax.responseText);
        append_json(data);
      }
    };

    get(append_json, "http://localhost:8080/sandwichs_ingredients");
  }

  function append_json(data) {
    debugger;
    var table = document.querySelector("#content-place");
    var trs = "";
    data.forEach(function(object) {
      debugger;
      var tr =
        "<tr>" +
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
        "</td>" +
        "</tr>";
      trs += tr;
    });

    function format_ingredients(data) {
      var text = "";
      data.forEach(element => {
        text += element.name + " R$" + element.price + "<br>";
      });
      return text;
    }

    var table_struct =
      "<h2>Selecione seu Sanduíche</h2>" +
      "  <br />" +
      '  <table class="table table-striped">' +
      "    <thead>" +
      "      <tr>" +
      '        <th scope="col">#</th>' +
      '        <th scope="col" style="display:none;">Id</th>' +
      '        <th scope="col">Sanduíche</th>' +
      '        <th scope="col">Ingredientes</th>' +
      '        <th scope="col">Quantidade</th>' +
      "      </tr>" +
      "    </thead>" +
      "    <tbody>" +
      "    {0}    " +
      "    </tbody>" +
      "  </table>";

    table_struct = table_struct.replace("{0}", trs);
    table.innerHTML = table_struct;
  }

  function get(callback, url) {
    var ajax = new XMLHttpRequest();
    ajax.open("GET", url, true);
    ajax.send();

    ajax.onreadystatechange = function() {
      if (ajax.readyState == 4 && ajax.status == 200) {
        var data = JSON.parse(ajax.responseText);
        callback(data);
      }
    };
  }
})();
