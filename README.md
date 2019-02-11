# myandroidApp
app simple survey and question app
                                                
                                                          
MainActivity.java                                
SecondScreen.java                                 
ThirdScreen.java        ---RVAdapter.java            
FouthScreen.java                                    
                         
                         layout
                              
                              
                              activity_main.xml
                                 activity_second.xml
           recycler_view.xml ---- item.xml
                                   activity_fourth.xml

AndroidManifest.xml
strings.xml



refrences:1.https://android.jlelse.eu/using-glide-few-tips-to-be-a-pro-60f41e29d30a

So always pass current context to the Glide in Activity or Fragment using :
Glide.with(this)
Read TWiStErRob’s more detailed answer here.
Ref : http://stackoverflow.com/a/32887693/3746306

5. Use RequestManager object in RecyclerView
We generally tend to use the sample code given in tutorials or docs as it is as long as its working its fine for us. With Glide this could lead to using 
it in Recycler view onBindViewHolder method like this :

Glide.with(context).load(...) 

Rather than doing this we can simply pass RequestManager object in Adapter’s constructor method and use it in a onBindViewHolder like :


private RequestManager glide;

public WalletsAdapter(RequestManager glide, List<MediaModel> modelList)
    {
    this.glide = glide;
    this.modelList = modelList;
}

@Override
public void onBindViewHolder(final WalletViewHolder holder, int position) {

    glide.load(getModel(position).url).into(holder.iconImages);
  
}
And adapter constructor would look like :


WalletsAdapter adpater = new WalletsAdapter(Glide.with(this), modelList);

