/**
 * Интерфейс "Оружие".
 * Имеет поля: wpnDamage - урон; wpnSizeMagazine - размер магазина; wpnRange - дальность выстрела.
 */
public interface ntrfWeapon {
    /**
     * @return Урон оружия 
     */
    int wpnDamage();
    /**
     * @return Размер магазина
     */
    int wpnSizeMagazine();
    /**
     * @return Дальность выстрела
     */
    int wpnRange();

}
