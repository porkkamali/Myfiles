var a1 = [1, 2, 3, 4];
var a2 = [1, 5, 2, 3];
var result = [];
for (var i = 0; i < a1.length; i++) {
    if (a2.indexOf(a1[i]) === -1) {
        result.push(a1[i]);
    }
}
for (var i = 0; i < a2.length; i++) {
    if (a1.indexOf(a2[i]) === -1) {
        result.push(a2[i]);
    }
}
for(var i=0;i < result.length; i++){
console.log(result[i]);
}
