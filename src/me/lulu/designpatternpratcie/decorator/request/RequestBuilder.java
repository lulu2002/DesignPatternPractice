package me.lulu.designpatternpratcie.decorator.request;

public class RequestBuilder {

    private Request request;

    public RequestBuilder(Request request) {
        this.request = request;
    }

    public static RequestBuilder from(Request request) {
        return new RequestBuilder(request);
    }

    public RequestBuilder cooldown(int second) {
        this.request = new RequestCooldownDecorator(request, second);
        return this;
    }

    public RequestBuilder checkIgn() {
        this.request = new RequestIgnDecorator(this.request);
        return this;
    }

    public Request build() {
        return request;
    }

}
