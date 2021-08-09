package barracksWars.core.commands;

import barracksWars.interfaces.Repository;
import barracksWars.interfaces.Unit;
import barracksWars.interfaces.UnitFactory;

public class AddCommand extends Command {

       public AddCommand(String[] data, UnitFactory factory, Repository repository) {
        super(data, factory, repository);
    }


    @Override
    public String execute() {
        String unitType = getData()[1];
        Unit unitToAdd = getFactory().createUnit(unitType);
        getRepository().addUnit(unitToAdd);
        String output = unitType + " added!";
        return output;
    }
}
