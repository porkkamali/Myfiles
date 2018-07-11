function ex3(email){
    var mail = /^\w+@[a-z A-Z_]+?\.[a-z A-Z]{2,3}$/;
 
      var res = mail.test(email);
 
      return res;
 
 }
 console.log(ex3('hakast@gmail.com'));
 console.log(ex3('hakastgmail.com'));
 console.log(ex3('hakast@gmailcom'));