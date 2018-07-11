
function removeDuplicateUsingSet(arr){
    var unique_array = Array.from(new Set(arr))
    return unique_array
}

var array_with_duplicates = ['Cat', 'Dog', 'Fish', 'Dog', 'Bird'];
console.log(removeDuplicateUsingSet(array_with_duplicates));

