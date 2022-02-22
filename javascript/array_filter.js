// var arr=[1,2,3,4,5];
// var res=arr.filter(myfunc);
// function myfunc(arr1)
// {
//   return arr1>=3;
// }
// console.log(res);

Array.prototype.myfil = function (callback) {
  var ans=[];
  for(let i=0;i<this.length;i++)
  {
    ans[i]=callback(this[i],i,this);

  }
  return ans;

}
const num=[2,3,4,6,8];
console.log("Before calling myfil:"+num);
const ans=num.myfil(addnum);
console.log("After calling myfil:"+ans);

function addnum(currentval,ind,array){
  return >=2;
}
