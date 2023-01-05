/**
 * Вид "АК" подкласса "Винтовки"
 */
public class rflAK extends wpnRifle {

    @Override
    public int wpnDamage() {
        return 100;
    }

    @Override
    public int wpnSizeMagazine() {
        return 30;
    }

    @Override
    public int wpnRange() {
        return 50;
    }
    
}
