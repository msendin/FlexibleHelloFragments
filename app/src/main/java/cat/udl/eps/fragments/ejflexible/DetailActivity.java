package cat.udl.eps.fragments.ejflexible;
 
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

public class DetailActivity extends FragmentActivity {
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        
           DetailFrag detalle =
              (DetailFrag) getSupportFragmentManager().findFragmentById(R.id.frag_capt);

           if (detalle != null)
           detalle.mostrarDetalle(
              getIntent().getStringExtra("value"));
        
    }
}