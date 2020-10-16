public  class Hero extends  GameEntity{

    private int shield;

    public Hero(int shield, int health, int damage){
        super(health, damage);
        this.shield = shield;
    }

    public int getShield(){
        return shield;
    }

    public void makeVictorySound(String sound){                  //1 - method
        System.out.println(sound);
    }

    public String makeVictorySound(int num, String sound){         //2 - method
        for (int i = 0; i < num; i++) {
            System.out.println(sound);
        }
            return sound;
    }

    public  final void makeVictorySound(String sound, int num){  //3 - method and final
        for (int i = 0; i < num; i++) {
            System.out.println(sound);
        }
    }

    public String getInfo(){
        return super.getInfo()  + "\nshield  = " +  shield;
    }
}
