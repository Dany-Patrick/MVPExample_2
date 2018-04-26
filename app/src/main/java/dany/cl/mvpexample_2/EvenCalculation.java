package dany.cl.mvpexample_2;

public class EvenCalculation {
    private EvenCallback callback;

    public EvenCalculation(EvenCallback callback) {
        this.callback = callback;
    }
    public  void calculation(String value)
    {
        if(value.trim().length() > 0)
        {

            int auxValue = Integer.parseInt(value);
            if(auxValue%2 == 0)
            {
                callback.evenResult("Es par");
            }else
            {
                callback.evenResult("Es impar");
            }

        }else{
            callback.blankInput();
        }

    }
}
