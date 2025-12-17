class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   System.out.println(creditCardType("494387594587"));
   System.out.println(creditCardType("5512345678901234"));
   System.out.println(creditCardType("341234567890123"));
   System.out.println(creditCardType("6011123456789012"));
   System.out.println(creditCardType("36123456789012"));
   System.out.println(pigLatin("apple"));
   System.out.println(nycLocate("10001"));
}

  String creditCardType(String ccNumber){
    if(ccNumber.substring(0,1).equals("4")){
      return "Visa";
    } else if(ccNumber.substring(0,2).equals("51") || ccNumber.substring(0,2).equals("55")){
      return "MasterCard";
    } else if(ccNumber.substring(0,2).equals("34") || ccNumber.substring(0,2).equals("37")){
      return "American Express";
    } else if(ccNumber.substring(0,4).equals("6011") || ccNumber.substring(0,2).equals("65")){
      return "Discover";
    } else if(ccNumber.substring(0,2).equals("36")){
      return "Diners Club";
    } else {
      return "Unknown";
    }
  }
  
  String pigLatin(String word){
    return word.substring(1) + word.substring(0,1) + "ay";
    }
    
  String nycLocate(String zip){
    if(zip.substring(0,3).equals("100") || zip.substring(0,3).equals("101") || zip.substring(0,3).equals("102")){
      return "Manhattan";
    } else if(zip.substring(0,3).equals("103")){
      return "Staten Island";
    } else if(zip.substring(0,3).equals("104")){
      return "Bronx";
    } else if(zip.substring(0,3).equals("112")){
      return "Brooklyn";
    } else if(zip.substring(0,3).equals("113") || zip.substring(0,3).equals("114") || zip.substring(0,3).equals("111")){
      return "Queens";
    } else {
      return "Unknown";
    }
  }

}