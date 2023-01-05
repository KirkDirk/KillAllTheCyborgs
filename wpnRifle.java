/**
 * Класс "Винтовки" с интерфейсом "Оружие"
 */
public abstract class WpnRifle implements NtrfWeapon {
    /**
     * Количество выстрелов за раз - 3*/    
    public int numbersShot() {
        return 3;
    };
    
    @Override
    public String toString() {
        return String.format("[У: %d, М: %d, Д: %в]", wpnDamage(), wpnSizeMagazine(), wpnRange());
    }
}
