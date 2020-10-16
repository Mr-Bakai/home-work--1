public class GameEntity {
    private int health;
    private int damage;

    public GameEntity(){}

    public GameEntity(int health, int damage){
        this.health = health;
        this.damage = damage;
    }


    public int getHealth(int health){
        return health;
    }

    public int getDamage( int damage){
        return  damage;
    }

    public String getInfo(){
       return  "\nGameEntity" + "" +
               "\nhealth  = " + health + "" +
               "\ndamage  = " + damage;
    }
}
