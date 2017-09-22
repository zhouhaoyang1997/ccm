package mapper;
import vo.Location;
import vo.Vm;

public interface VmMapper {

    public Vm getLastedVm(String ipId);

    public Location getLocation(String ipId);
}
