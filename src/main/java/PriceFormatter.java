public class PriceFormatter {

    public String format(double price){
        String text = "";
        if (10 <= (int) price && (int) price <= 19){
            text = "рублей";
        } else{
            switch ((int) price%10){
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    text = "рублей";
                    break;
                case 1:
                    text = "рубль";
                    break;
                case 2:
                case 3:
                case 4:
                    text = "рубля";
                    break;
                default:
                    break;
            }
        }
        return text;
    }
}
