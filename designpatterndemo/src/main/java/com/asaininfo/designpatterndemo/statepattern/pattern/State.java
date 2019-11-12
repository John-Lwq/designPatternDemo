package com.asaininfo.designpatterndemo.statepattern.pattern;

/**
 * @author luowq
 * @description
 * @date 2019/11/3
 */
public interface State {
    void insertCount();
    void rejectCount();
    void startWash();

}
