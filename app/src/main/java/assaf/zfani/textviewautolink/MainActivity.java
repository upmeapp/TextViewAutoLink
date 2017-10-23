package assaf.zfani.textviewautolink;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        AutoCompleteTextView autoCompleteTextView =(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        String[] names = new String[]{"Syinon","Sdavid","Shalom","Tal","Tudi","amit","Tomer"};
        ArrayAdapter<String>namesAdapter= new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,names);//לייאאוט שיודע לקחת את הסטרינגים ולהכניס אותם לטקסט ויו
        autoCompleteTextView.setAdapter(namesAdapter);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////


        MultiAutoCompleteTextView multiAutoCompleteTextView=(MultiAutoCompleteTextView)findViewById(R.id.multiComplete);
        ArrayAdapter<CharSequence>productsAdaper =ArrayAdapter.createFromResource(this,R.array.products,android.R.layout.simple_dropdown_item_1line);
        multiAutoCompleteTextView.setAdapter(productsAdaper);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
