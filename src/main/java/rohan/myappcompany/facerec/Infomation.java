package rohan.myappcompany.facerec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.CaseMap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.net.Inet4Address;
import java.util.ArrayList;

public class Infomation extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    Button more;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infomation);

        tv1 = (TextView)findViewById(R.id.Title);
        tv2 = (TextView)findViewById(R.id.name);
        tv3 = (TextView)findViewById(R.id.cause);
        more  = (Button)findViewById(R.id.more);



        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("ans");

        tv2.setText("Name : "+name);


        ArrayList<String> list = new ArrayList<>();
        list.add("Add 2 cups of oatmeal to a lukewarm bath. Pat (not rub) the body dry." +
                " Put calamine lotion on itchy areas (but not on the face, especially near the eyes, or on the genitals)." +
                " Give an antihistamine (such as diphenhydramine [Benadryl, etc.])");
        list.add("Use the needle to puncture the blister.\n" +
                " Aim for several spots near the blister's edge. " +
                "Let the fluid drain, but leave the overlying skin in place." +
                " Apply an ointment such as petroleum jelly to the blister and cover it with a nonstick gauze bandage." +
                " If a rash appears, stop using the ointment.");
        list.add("Take lukewarm (not hot) showers or baths for no more than 10 or 15 minutes to prevent dry skin." +
                " Dry yourself very carefully (pat dry, instead of rubbing hard) and apply moisturizing lotion all over your body." +
                " Add colloidal oatmeal to the bath or as a paste on your skin.");

        if(name.equals(" Chickenpox")){
            tv3.setText("First Aid : "+list.get(0));
            more.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent viewIntent =
                            new Intent("android.intent.action.VIEW",
                                    Uri.parse("https://en.wikipedia.org/wiki/Chickenpox#:~:text=Chickenpox%2C%20also%20known%20as%20varicella,blisters%2C%20which%20eventually%20scab%20over."));
                    startActivity(viewIntent);
                }
            });
        }else if(name.equals(" Blister")){
            tv3.setText("First Aid : "+list.get(1));
            more.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent viewIntent =
                            new Intent("android.intent.action.VIEW",
                                    Uri.parse("https://en.wikipedia.org/wiki/Blister#:~:text=A%20blister%20is%20a%20small,fluid%2C%20either%20serum%20or%20plasma."));
                    startActivity(viewIntent);
                }
            });
        }else if(name.equals(" eczema")){
            tv3.setText("First Aid : "+list.get(2));
            more.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent viewIntent =
                            new Intent("android.intent.action.VIEW",
                                    Uri.parse("https://en.wikipedia.org/wiki/Dermatitis"));
                    startActivity(viewIntent);
                }
            });
        }else{
            tv3.setText("something went wrong");
        }












    }
}