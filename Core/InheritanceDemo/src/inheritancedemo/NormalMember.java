/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritancedemo;

/**
 *
 * @author IT
 */
public class NormalMember extends Member {

    public NormalMember() {
    //System.out.println("child contructor with no parameter");
    }
    
    

    public NormalMember(String pName, int pMemberID, int pMemberSince)
    {
        super(pName, pMemberID,pMemberSince);
        //System.out.println("child contructor with 3 parameter");
    }
    
    @Override
    public void calculateAnnualFee()
    {
        annualFee=(1-0.01*getDiscount())*(100+12*30);
    }

    
}
