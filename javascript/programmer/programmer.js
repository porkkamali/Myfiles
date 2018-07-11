var myObj =
    [{ 'name': 'Saurabh', 'age': 30, 'occupation': "Team Leader" },
    { 'name': 'Anupriya', 'age': 32, 'occupation': "Team Leader" },
    { 'name': 'Kalyani', 'age': 25, 'occupation': "Programmer" },
    { 'name': 'Damodaran', 'age': 27, 'occupation': "Programmer" },
    { 'name': 'Krishnakath', 'age': 22, 'occupation': "Programmer" },
    { 'name': 'Venketraman', 'age': 27, 'occupation': "Programmer" }];

//all objects with occupation with programmer
for (var i = 0; i < myObj.length; i++) {
    if (myObj[i].occupation == "Programmer")
        console.log(myObj[i]);
}

//sort all object on age basis
console.log(myObj.sort((a, b) => a.age < b.age));

//Recreate the above array of objects into the following object of objects

var newObj = {}
for (var z of myObj) {
    newObj[z['occupation']] = [];
}
for (var z of myObj) {
    newObj[z['occupation']].push(z);
}
for (var k in newObj) {
    for (var l of newObj[k]) {
        delete l['occupation']
    }
}
console.log(newObj);

//map function to create a new array containing only names present in myObj
var NewArray = myObj.map(function (value) {
    return {
        name: value.name
    }
})
for (var i in NewArray) {
    console.log(NewArray[i].name);
}

