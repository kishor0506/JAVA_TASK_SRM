package com.day2.Paymentdetails;

public interface Paymentmode {
   void Accountdetails(long acc_no,String ifsc,String mmid,int ph_no);
   void Carddetails(long card_no,String cvv,String name);
   void Cod(String address,String loction,String ph_no);
   void UPi(String name,String upiadd);
   
}
