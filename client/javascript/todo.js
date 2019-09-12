/**
 * Function to get all the users!
 */
function getAllUsers() {
  console.log("Getting all the users from todo.");

  get("/api/todo", function (returned_json) {
    document.getElementById('jsonDump').innerHTML = returned_json;
  });
}

function getAllUsersByAge() {
  console.log("Getting all the users.");

  get("/api/todo?age=" + document.getElementById("age").value, function (returned_json) {
    document.getElementById('jsonDump').innerHTML = returned_json;
  });
}
