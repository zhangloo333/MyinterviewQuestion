/**
 * Created by leizha on 10/6/16.
 */
var singalNumber = function (nums) {
    if(nums === null || nums.length <=0) {
        return -1;
    }
    // method1
    // nums.sort();
    //
    // for (var i =0; i<nums.length; i+=2) {
    //     if (nums[i] != nums[i+1])
    //         return nums[i]
    //
    // }
    // console.log('have not find');

    // method2
    var middle = 0;
    for (var i =0; i<nums.length; i++) {
        middle ^= nums[i]

    }
    return middle;

}

var array = [1,2,3,4,5,1,4,3,5];
console.log(singalNumber(array));