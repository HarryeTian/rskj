/*
 * This file is part of RskJ
 * Copyright (C) 2018 RSK Labs Ltd.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package co.rsk.net.notifications;

/***
 * An Enum representing the possible results obtained from the
 * {@link co.rsk.net.notifications.FederationNotificationProcessor} when
 * processing {@link FederationNotification} instances.
 *
 * @author Diego Masini
 * @author Jose Orlicki
 *
 */
public enum FederationNotificationProcessingResult {
    NOTIFICATION_PROCESSED_SUCCESSFULLY,
    NOTIFICATION_RECEIVED_TOO_FAST,
    NOTIFICATION_EXPIRED,
    NOTIFICATION_ALREADY_PROCESSED,
    NOTIFICATION_SIGNATURE_DOES_NOT_VERIFY
}
