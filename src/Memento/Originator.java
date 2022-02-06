package Memento;

import java.util.Date;

public class Originator {
    private String state;
    private Date date;

    public void changeState(String newState) {
        state = newState;
        date = new Date();
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state='" + state + '\'' +
                ", date=" + date +
                '}';
    }

    public Save save() {
        return new Save(state, date);
    }

    public void getSave(Save save) {
        state = save.getState();
        date = save.getDate();
    }
    class Save {
        private final String state;
        private final Date date;

        Save(String state, Date date) {
            this.state = state;
            this.date = date;
        }

        public String getState() {
            return state;
        }

        public Date getDate() {
            return date;
        }
    }
}
