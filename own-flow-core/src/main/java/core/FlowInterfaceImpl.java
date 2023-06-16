package core;

/**
 * @author wzx
 * @version 1.0
 * @description: TODO
 * @date 2023/6/12 23:36
 */
public abstract class FlowInterfaceImpl implements FlowInterface {

    /**
     *  审批
     * @param taskId 流程任务唯一标识
     * @param currentActionUserId 流程当前操作人唯一标识
     * @param flowActionEnum  操作信息
     */
    public void actioning(String taskId, String currentActionUserId, FlowActionEnum flowActionEnum) {

    }
}
