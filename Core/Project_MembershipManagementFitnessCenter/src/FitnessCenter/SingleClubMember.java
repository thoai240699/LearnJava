/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FitnessCenter;

/**
 *
 * @author IT
 */
public class SingleClubMember extends Member {
    
    private int club;

    public SingleClubMember(int club, char memberType, int memberID, String name, double fees) {
        super(memberType, memberID, name, fees);
        this.club = club;
    }

    public int getClub() {
        return club;
    }

    public void setClub(int club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return super.toString()+", "+this.club;
    }
    
    
    
    
}
