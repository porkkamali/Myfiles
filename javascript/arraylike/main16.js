var obj = { "one": "1", "Two": "2", "Three": "3", "Four": "4" };
var a =[];
//JavaScript array like using propertyvalues
for (var i in obj) {
    var val= obj[i];
    a.push(val);
}
console.log(a);