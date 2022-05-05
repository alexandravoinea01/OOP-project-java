package repositories.organizationRepositories;

import entities.organization.Appointment;
import repositories.GenericRepository;

import java.util.HashSet;

public class AppointmentRepository implements GenericRepository<Appointment> {
    private HashSet<Appointment> appointments = new HashSet<Appointment>();
    private Appointment[] apps = appointments.toArray(new Appointment[appointments.size()]);

    @Override
    public void add(Appointment entity) {
        appointments.add(entity);
    }

    @Override
    public Appointment get(int id) {
        return apps[id];
    }

    @Override
    public void update(Appointment entity, Appointment newEntity) {
        for (Appointment i : appointments)
            if (i == entity) {
                i = newEntity;
                return;
            }
    }

    @Override
    public void delete(Appointment entity) {
        appointments.remove(entity);
    }

    @Override
    public int getSize() {
        return appointments.size();
    }
}
