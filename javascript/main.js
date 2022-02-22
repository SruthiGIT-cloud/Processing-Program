class User
{
  constructor(email,password,name)
  {
    this.email=email;
    this.password=password;
    this.name=name;
  }

 register()
{
  console.log(this.name +' is now have been registered');
}
}
let obj=new User('arsruthi208@gmail.com','1234','sruthi')
obj.register();
class Students extends User
{
  constructor(email,password,name,countofall)
  {
    super(email,password,name);
    this.countofall=countofall;
  }
  static count()
  {
    console.log('count of all students are 30');
  }
}
Students.count();
let obj2=new Students('arsruthi208@gmail.com','12345','sruthi','40');
console.log(obj2.password);
