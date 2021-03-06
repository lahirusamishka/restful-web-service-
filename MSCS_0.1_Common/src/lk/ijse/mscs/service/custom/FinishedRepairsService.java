/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mscs.service.custom;

import java.util.List;
import lk.ijse.mscs.dto.FinishedRepairDTO;
import lk.ijse.mscs.service.SuperService;

/**
 *
 * @author samishka
 */
public interface FinishedRepairsService extends SuperService {

    public boolean addFinishedRepairs(FinishedRepairDTO finishedRepair) throws Exception;

    public boolean deleteFinishedRepair(String FinishedRepairId) throws Exception;

    public boolean updateFinishedRepair(FinishedRepairDTO finishedRepair) throws Exception;

    public List<FinishedRepairDTO> getAllFinishedRepairs() throws Exception;

    public FinishedRepairDTO searchfinishedRepair(String FinishedRepairId) throws Exception;
}
