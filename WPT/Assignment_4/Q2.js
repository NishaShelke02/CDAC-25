function forEachElement(arr,callback) {
    for (let i = 0; i < arr.length; i++) {
        callback(arr[i], i, arr);
    }
}
forEachElement([1,2,3,4,5,6,7],function(element, index){
    console.log('Index ${index}: Element ${element}');
})