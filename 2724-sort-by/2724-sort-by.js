/**
 * @param {Array} arr
 * @param {Function} fn
 * @return {Array}
 */
var sortBy = function(arr, fn) {
    arr.sort(function(a,b){
        let aa = fn(a);
        let bb = fn(b);
        return aa-bb;
    });
    return arr;
};