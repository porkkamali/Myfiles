var myObj = [5, [22], [[14]], [[4]],[5,6]];
var flattened = [].concat.apply([],myObj);
console.log(flattened);