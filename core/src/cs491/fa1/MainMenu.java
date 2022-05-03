package cs491.fa1;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.utils.Json;

public class MainMenu extends ApplicationAdapter {


    //If Volume will be on or off
    Boolean Volume = new Boolean(true);

    //Used to check if user info is Loaded
    //Boolean SaveDataLoaded = new Boolean();

    //Selected Level to be loaded, Inital Value 0
    int SelectedLevel = 0;

    //Data of the players save
    Json SaveFile = new Json();

    public void RequestData(){
        //Imports the Data from the JSON file and puts into java Object
        try{
            //SaveFile.copyFields();
        }
        catch (Exception e){
            //SaveFile.fromJson()
        }

    }

    public void create(){

    }

}
