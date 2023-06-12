package core;

/**
 * @author wzx
 * @version 1.0
 * @description: TODO
 * @date 2023/6/12 23:35
 */
public enum FlowActionEnum {

    DRAFTS("DRAFTS","草稿"),
    PASS("PASS","通过"),
    REJECT("REJECT","拒绝"),
    DONE("DONE","完成"),
    FAILED("FAILED","失败"),
    WITHDRAW("WITHDRAW","撤回"),
    RETURN("RETURN","打回"),
    ;


    private String actionCode;

    private String actionName;

    FlowActionEnum() {
    }

    FlowActionEnum(String actionCode, String actionName) {
        this.actionCode = actionCode;
        this.actionName = actionName;
    }

    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }
}
