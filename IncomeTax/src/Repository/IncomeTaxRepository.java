/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAccess.IncomeTaxDAO;

/**
 *
 * @author Asus
 */
public class IncomeTaxRepository implements IIncomeTaxRepository {

    @Override
    public void addFamily() {
        IncomeTaxDAO.Instance().addFamily();
    }

}
