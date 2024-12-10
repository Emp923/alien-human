import java.util.ArrayList;
import java.util.List;

public class Environment {

    private List<Entity> entities;

    public Environment() {
        entities = new ArrayList<>();
    }

    public int getEntityCount() {
        return entities.size();
    }

    public void addEntity(Entity entity) {
        entities.add(entity);
    }

    public void attacksAllEntities(Entity attacker) {
        for (Entity entity : entities) {
            attacker.attackEntity(entity);
        }
    }

}
