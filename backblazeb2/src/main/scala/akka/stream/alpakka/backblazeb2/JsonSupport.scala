/*
 * Copyright (C) 2016 Lightbend Inc. <http://www.lightbend.com>
 */
package akka.stream.alpakka.backblazeb2
import akka.stream.alpakka.backblazeb2.Protocol._
import io.circe.{Decoder, Encoder}
import io.circe.generic.auto._
import de.heikoseeberger.akkahttpcirce.CirceSupport._

object JsonSupport {
  implicit val accountAuthorizationTokenEncoder: Encoder[AccountAuthorizationToken] =
    Encoder.encodeString.contramap(_.value)

  implicit val accountAuthorizationTokenDecoder: Decoder[AccountAuthorizationToken] =
    Decoder.decodeString.map(AccountAuthorizationToken)

  implicit val uploadAuthorizationTokenEncoder: Encoder[UploadAuthorizationToken] =
    Encoder.encodeString.contramap(_.value)

  implicit val uploadAuthorizationTokenDecoder: Decoder[UploadAuthorizationToken] =
    Decoder.decodeString.map(UploadAuthorizationToken)

  implicit val accountIdEncoder: Encoder[AccountId] =
    Encoder.encodeString.contramap(_.value)

  implicit val accountIdDecoder: Decoder[AccountId] =
    Decoder.decodeString.map(AccountId)

  implicit val bucketIdEncoder: Encoder[BucketId] =
    Encoder.encodeString.contramap(_.value)

  implicit val bucketIdDecoder: Decoder[BucketId] =
    Decoder.decodeString.map(BucketId)

  implicit val apiUrlEncoder: Encoder[ApiUrl] =
    Encoder.encodeString.contramap(_.value)

  implicit val apiUrlDecoder: Decoder[ApiUrl] =
    Decoder.decodeString.map(ApiUrl)

  implicit val uploadUrlEncoder: Encoder[UploadUrl] =
    Encoder.encodeString.contramap(_.value)

  implicit val uploadUrlDecoder: Decoder[UploadUrl] =
    Decoder.decodeString.map(UploadUrl)

  implicit val authorizeAccountResponseDecoder = Decoder[AuthorizeAccountResponse]
  implicit val getUploadUrlResponseDecoder = Decoder[GetUploadUrlResponse]

  implicit val authorizeAccountResponseUnmarshaller = circeUnmarshaller[AuthorizeAccountResponse]
  implicit val getUploadUrlResponseUnmarshaller = circeUnmarshaller[GetUploadUrlResponse]
}
