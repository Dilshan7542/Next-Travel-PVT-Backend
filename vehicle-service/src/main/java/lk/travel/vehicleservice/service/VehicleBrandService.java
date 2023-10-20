package lk.travel.vehicleservice.service;

import lk.travel.vehicleservice.dto.VehicleBrandDTO;

import java.util.List;

public interface VehicleBrandService {
    VehicleBrandDTO saveVehicleBrand(VehicleBrandDTO vehicleBrandDTO);
    VehicleBrandDTO updateVehicleBrand(VehicleBrandDTO vehicleBrandDTO);
    VehicleBrandDTO searchVehicleBrand(int vehicleID);
    void deleteVehicleBrand(int vehicleID);
    List<VehicleBrandDTO> getAllVehicleBrand();
}