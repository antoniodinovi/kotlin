package co.novu.api

import co.novu.dto.request.BroadcastEventRequest
import co.novu.dto.request.TriggerEventRequest
import co.novu.dto.response.TriggerResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.POST
import retrofit2.http.Path



interface EventsApi {

    @POST("v1/events/trigger")
    suspend fun triggerEvent(@Body body: TriggerEventRequest): Response<TriggerResponse>

    @POST("v1/events/trigger/broadcast")
    suspend fun broadcastEvent(@Body body: BroadcastEventRequest): Response<TriggerResponse>

    @DELETE("v1/events/trigger/{transactionId}")
    suspend fun cancelTriggerEvent(@Path("transactionId") transactionId: String): Response<Unit>

}
