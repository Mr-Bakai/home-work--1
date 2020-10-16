public final class Warrior  extends  Hero {

    private SuperAbility superAbility;
    private TypeOfBoost typeOfBoost;
    private int criticalDamage;

    public Warrior(TypeOfBoost typeOfBoost, SuperAbility superAbility, int criticalDamage, int shield, int health, int damage) {
        super(shield, health, damage);
        this.superAbility = superAbility;
        this.typeOfBoost = typeOfBoost;
        this.criticalDamage = criticalDamage;
    }

    public SuperAbility getSuperAbility() {
        return superAbility;
    }

    public TypeOfBoost getTypeOfBoost() {
        return typeOfBoost;
    }

    public int getCriticalDamage() {
        return criticalDamage;
    }

    public void setSuperAbility(SuperAbility superAbility) {
        this.superAbility = superAbility;
    }

    public void setTypeOfBoost(TypeOfBoost typeOfBoost) {
        this.typeOfBoost = typeOfBoost;
    }

    public void setCriticalDamage(int criticalDamage) {
        this.criticalDamage = criticalDamage;
    }

    @Override
    public String makeVictorySound(int num, String sound) {    // in order to make it changeable, you have to make it returnable in superclass
        return super.makeVictorySound(num, sound) + TypeOfBoost.AGILITY_BOOST;
    }

    public String getInfo(){
        return super.getInfo() + " " +
                "\ntypeOfBoost  = " + typeOfBoost +
                "\nCritical damage = " + criticalDamage + getSuperAbility().superInfo();

    }

    public void copy(Warrior x){
        this.setSuperAbility(x.getSuperAbility());
        this.setTypeOfBoost(x.getTypeOfBoost());
    }

    public String copyInfo(){
        return "\nTypo of  boost " + typeOfBoost + " "+
                "\nSuper Ability\uD83D\uDC47 " + getSuperAbility().superInfo();
    }


}


/* Основное
a)  Доделать все пункты практического задания по презентации                                    ✅
b)  Создать иерархию из 3х классов (1й -> 2й -> 3й уровень иерархии),
    последний 3й класс сделать не наследуемым                                                   ✅
c)  Все поля классов должны быть приватными, одно из полей должно быть
    сложного типа созданного вами же (4й класс), одно из полей сделать сложного типа (enum)     ✅
d)  В классах не должно быть setter-ов, только getter-ы и конструкторы                          ✅
e)  Добавить перегруженные методы (2-3 шт.) в класс 2-го уровня иерархии,
    один из них сделать неперезаписываемым                                                      ✅
f)  В классе 3-го уровня перезаписать один из методов родителя                                  ✅
g)  В главном классе (Main) Создать объект класса 2-го уровня
    (objectA) и 2 объекта класса 3-го уровня (objectB, objectC),
    также распечатать все свойства объектов и вызвать перегруженные
    методы через каждый из экземпляров ваших объектов.                                          ✅


На сообразительность
h)  Написать метод в классе 3-го уровня который бы копировал
    некоторые свойства из себеподобного объекта                                                 ✅
i)  Затем скопировать несколько свойств из
    objectB в objectC и распечатать информацию по objectC                                       ✅
 */
