
Array.prototype.myMap = function (callback) {
  var ans=[];
  for(let i=0;i<this.length;i++)
  {
    ans[i]=callback(this[i],i,this);

  }
  return ans;

}
const num=[2,3,4,6,8];
console.log("Before calling myMap:"+num);
const ans=num.myMap(addnum);
console.log("After calling myMap:"+ans);

function addnum(currentval,ind,array){
  return currentval*currentval;//square of each numbers
}
