package com.workintech.developers;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[10];
    private MidDeveloper[] midDevelopers = new MidDeveloper[10];
    private SeniorDeveloper[] seniorDevelopers=new SeniorDeveloper[10];

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("HRManager starts to working.");
    }
    public void addEmployee(int index,JuniorDeveloper juniorDeveloper){
        if(index> 9){
            System.out.println("HRManager cannot add more than 9 employees.");
            return;
        }
    JuniorDeveloper currentDeveloper = juniorDevelopers[index];
    if(currentDeveloper != null){
        System.out.println("HRManager is already working.");
        return;
    }
    juniorDevelopers[index] = juniorDeveloper;
    }
    public void addEmployee(int index,MidDeveloper midDeveloper){
        if(index> 9){
            System.out.println("Mid dev cannot add more than 9 employees.");
            return;
        }
        MidDeveloper currentDeveloper = midDevelopers[index];
        if(currentDeveloper != null){
            System.out.println("Mid dev is already working.");
            return;
        }
        midDevelopers[index] = midDeveloper;
    }
    public void addEmployee(int index,SeniorDeveloper seniorDeveloper){
        if(index> 9){
            System.out.println("Senior cannot add more than 9 employees.");
            return;
        }
        SeniorDeveloper currentDeveloper = seniorDevelopers[index];
        if(currentDeveloper != null){
            System.out.println("Senior is already working.");
            return;
        }
        seniorDevelopers[index] = seniorDeveloper;
    }


}
