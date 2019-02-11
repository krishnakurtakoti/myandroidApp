import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


import android.app.Activity;
        import android.os.Bundle;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;

        import com.bumptech.glide.Glide;
        //import com.example.myapplication.Models.Norm;
       // import com.example.myapplication.R;

        import java.util.ArrayList;
        import java.util.List;
//refrence layput evanto tuts getting started with recycler view and cardvirew tutorial
public class ThirdScreen extends Activity {
    private List<Norms> norms;
    private RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);
        rv = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializaData();
        initializeAdapter();
    }

    private  void initializaData(){
        norms = new ArrayList<>();
        // persons.add(new Person("Android Engineer","Bengaluru"));
        norms.add(new Norms("SetBack","In land use, a setback is the minimum distance which a building or other structure must be set back from a street or road, a river or other stream, a shore or flood plain, or any other place which is deemed to need protection. Depending on the jurisdiction, other things like fences, landscaping, septic tanks, and various potential hazards or nuisances might be regulated and prohibited by setback lines. Setbacks along state, provincial, or federal highways may also be set in the laws of the state or province, or the federal government. Local governments create setbacks through ordinances, zoning restrictions, and Building Codes, usually for reasons of public policy such as safety, privacy, and environmental protection. Neighborhood developers may create setback lines (usually defined in Covenants & Restrictions, and set forth in official neighborhood maps) to ensure uniform appearance in the neighborhood and prevent houses from crowding adjacent structures or streets.","http://content.aucklanddesignmanual.co.nz/ADM%20Images/Carousel/003_Apartments/003-06%20Building/003-06-2%20Building%20Form/003-06-2-3%20Building%20Setbacks/Bldg%20Setback%202/6.2.3%20(c)1.jpg"));

        norms.add(new Norms("Floor Aspect Ratio","From Wikipedia, the free encyclopedia Floor area ratio (FAR) is the ratio of a building's total floor area (gross floor area) to the size of the piece of land upon which it is built. The terms can also refer to limits imposed on such a ratio through zoning.\n" +
                "As a formula FAR = (gross floor area) / (area of the plot).The floor area ratio (FAR) can be used in zoning to limit urban density. While it directly limits building density, indirectly it also limits the number of people that a building can hold, without controlling a building's external shape.\n" +
                "For example, if lot must adhere to a 0.1 FAR, then the total area of all floors in all buildings on the lot must be no more than one-tenth the area of the parcel itself. In other words, if the lot was 10,000 sq. ft, then the total floor area of all floors in all buildings mustn't exceed 1,000 sq. ft.\n" +
                "In India FAR and FSI are both used. FAR regulations vary from city to city and generally it is from 1.3 to 3.25. In Mumbai 1.33 is the norm but higher FSI is allowed along the Metro rail line and slum areas like Dharavi. In Bangalore, 40 feet streets allow only an FAR of 1.75 but 100 feet streets allow 3.25 FAR.\n","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQYimHsWVY8PRKEvKXOXfkGNsM90KginION09Q4cxEASusjgj0nBQ"));

        norms.add(new Norms("Distance to road","Width of the road: i. While determining the width of the road the distance between the boundaries of a road including foot path, drains measured at right angles at the center of the plot. ii. In case of roads having service roads in addition to the main roads, the width of the roads shall be aggregate width of service roads and main roads for determining the FAR.","https://qph.fs.quoracdn.net/main-qimg-734818cdb148b8e84f1172dc713e1a24.webp"));

        norms.add(new Norms("Height of the floor of building","What is floor to floor height? Ideally should be 10–12 ft for a standard flat , but now a days builder usually give 9 ft .\n" +
                "\n" +
                "In case you want to go with pop in 9ft I would suggest you to take only 2 layers 1st at 0.5 ft and another at 1.5ft this way it will look more spacious .","http://d34gdyvx7hq6ey.cloudfront.net/wp-content/uploads/2017/10/CobaltFarmhouseGreatRoom5-1024x759.jpg"));
    }

    public void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(Glide.with(this),norms);
        rv.setAdapter(adapter);
    }
}
