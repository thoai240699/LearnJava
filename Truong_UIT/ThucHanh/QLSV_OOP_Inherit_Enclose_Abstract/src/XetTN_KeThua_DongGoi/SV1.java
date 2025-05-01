/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XetTN_KeThua_DongGoi;

/**
 *
 * @author IT
 */
public class SV1 extends SV{
    private double diemRL;

    public SV1( int maSV, int soTC, double diemTL, boolean ngoaiN, double diemRL) {
        super(maSV, soTC, diemTL, ngoaiN);
        this.diemRL = diemRL;
    }
    @Override
    public String toString(){
        return "SV1: " + super.toString();
    }

 
    @Override
    public void XetTN() {
    }
    

    
    
    
    
}
