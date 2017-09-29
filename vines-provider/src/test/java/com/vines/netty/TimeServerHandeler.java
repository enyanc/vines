package com.vines.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class TimeServerHandeler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelActive( final ChannelHandlerContext ctx) throws Exception {
        final ByteBuf bf=ctx.alloc().buffer(4);
        bf.writeInt((int)(System.currentTimeMillis()/1000L+2208988800L));
        final ChannelFuture f=ctx.writeAndFlush(bf);
        f.addListener(new ChannelFutureListener() {
            public void operationComplete(ChannelFuture future) throws Exception {
                assert  f==future;
                ctx.close();
            }
        });
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}
