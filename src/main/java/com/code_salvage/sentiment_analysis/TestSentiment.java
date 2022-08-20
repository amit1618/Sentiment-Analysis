package com.code_salvage.sentiment_analysis;

public class TestSentiment {
    public static void main(String []args) {
        Analyzer.init();
        Analyzer.estimatingSentiment("This is an excellent book. I enjoy reading it. I can read on Sundays. Today is only Tuesday. Can't wait for next Sunday. The working week is unbearably long. It's awful.");
        Analyzer.findSentiment("This is an excellent book. I enjoy reading it. I can read on Sundays. Today is only Tuesday. Can't wait for next Sunday. The working week is unbearably long. It's awful.");
    }
}