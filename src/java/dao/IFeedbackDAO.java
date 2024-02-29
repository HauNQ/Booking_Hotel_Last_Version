/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import model.FeedbackModel;

/**
 *
 * @author Nguyen Quang Hau
 */
public interface IFeedbackDAO {
    FeedbackModel findBy (long id);
}
