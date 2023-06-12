package core;

import dto.ActionDTO;

import java.util.List;

/**
 * @author wzx
 * @version 1.0
 * @description: TODO
 * @date 2023/6/12 23:27
 */
public interface FlowInterface {

    /**
     *  审批之前的所有操作 请在此处
     * @param taskId 流程任务唯一标识
     * @param currentActionUserId 流程当前操作人唯一标识
     */
    void beforeAction(String taskId, String currentActionUserId);

    /**
     *  当前审批开始执行 请在此处实现
     * @param taskId 流程任务唯一标识
     * @param currentActionUserId 流程当前操作人唯一标识
     * @param flowActionEnum  操作信息
     */
    void actioning(String taskId, String currentActionUserId,FlowActionEnum flowActionEnum);

    /**
     *  流程审批之后的所有操作 请在此处实现
     * @param taskId  流程任务唯一标识
     * @param flowActionEnums  操作信息 和 流程当前操作人唯一标识
     */
    void afterAction(String taskId, List<ActionDTO> flowActionEnums);

}
