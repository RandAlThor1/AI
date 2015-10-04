/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CharacterSats;

/**
 *
 * @author Ben
 */
public class CharacterMethods {
    public int Strength;
    public int Constitution;
    public int Dexterity;
    public int Intelligence;
    public int Wisdom;
    public int Charisma;
    
    public int StrengthMod;
    public int ConstitutionMod;
    public int DexterityMod;
    public int IntelligenceMod;
    public int WisdomMod;
    public int CharismaMod;
    
    public int Health;
    public int Speed;
    public int DodgeChance;
    
    public String CharacterName;
    
    public static int[][] inventory = new int[4][9];
    public static int[]   Hotbar    = new int   [9];
    public CharacterMethods(int Strength, int Constitution, int Dexterity, int Intelligence, int Wisdom, int Charisma, String CharacterName){
        this.Strength = Strength;
        this.Constitution = Constitution;
        this.Strength = Strength;
        this.Dexterity = Dexterity;
        this.Intelligence = Intelligence;
        this.Wisdom = Wisdom;
        
        this.StrengthMod =      (int) ((Strength - 10) / 2);
        this.ConstitutionMod =  (int) ((Constitution - 10) / 2);
        this.DexterityMod =     (int) ((Dexterity - 10) / 2);
        this.IntelligenceMod =  (int) ((Intelligence - 10) / 2);
        this.WisdomMod =        (int) ((Wisdom - 10) / 2);
        this.CharismaMod =      (int) ((Charisma - 10) / 2);
        
        this.Health = (int) 200 + ((Constitution - 10) / 2) * 50;
        this.Speed = (int) 100 + ((Dexterity - 10) / 2) * 25;
        this.DodgeChance = (int) 10 + ((Dexterity - 10) / 2) * 5;
        
        this.CharacterName = CharacterName;
    }
}


