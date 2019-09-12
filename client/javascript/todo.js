/**
 * Function to get all the users (but this time from todo)!
 */
function getAllUsers() {
  console.log("Getting all the users.");

  get("/api/todo", function (returned_json) {
    document.getElementById('jsonDump').innerHTML = returned_json;
  });
}

function getAllUsersByOwner() {
  console.log("Getting all the users.");

  get("/api/todo?owner=" + document.getElementById("owner").value, function (returned_json) {
    document.getElementById('jsonDump').innerHTML = returned_json;
  });
}

function getAllUsersByCategory() {
  console.log("Getting all the users.");

  get("/api/todo?category=" + document.getElementById("category").value, function (returned_json) {
    document.getElementById('jsonDump').innerHTML = returned_json;
  });
}
